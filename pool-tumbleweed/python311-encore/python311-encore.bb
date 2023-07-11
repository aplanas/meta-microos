SUMMARY = "Low-level core modules for building Python applications"
DESCRIPTION = "This package consists of a collection of core utility packages useful \
for building Python applications.  This package is intended to be at \
the bottom of the software stack and have zero required external \
dependencies aside from the Python Standard Library. \
 \
Packages: \
 \
  * Events: A package implementing a lightweight application-wide \
    Event dispatch system.  Listeners can subscribe to events based \
    on Event type or by filtering on event attributes.  Typical uses \
    include UI components listening to low-level progress \
    notifications and change notification for distributed resources. \
 \
  * Storage: Abstract base classes and concrete implementations of a \
    basic key-value storage API. The API is intended to be general \
    purpose enough to support a variety of local and remote storage \
    systems. \
 \
  * Concurrent: A package of tools for handling concurrency within \
    applications. \
 \
  * Terminal: Some utilities for working with text-based terminal \
    displays."
LICENSE = "Apache-2.0 & LGPL-2.1-only & Python-2.0"

PV = "0.8.0"

RPM_NAME = "python311-encore-0.8.0-1.7.noarch.rpm"
RPM_HASH = "51903b216377a8d7d442bf5a8bbab4be4e91ff6b8053b25ebdbcac404dd5115470de56b6fd5c120ea8c1c6ebbcd52a30c6250bb7a2bbb9f1158d5b8ad18dfc08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-encore \
python3.11dist-encore \
python311-encore \
python3dist-encore"

RDEPENDS:${PN} += "python-abi"

inherit rpm
