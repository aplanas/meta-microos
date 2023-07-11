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

RPM_NAME = "python39-encore-0.8.0-1.7.noarch.rpm"
RPM_HASH = "bb80ba11d79eb93f370215ebe81f7dd320571a8f6bbeb858a790ff5ee329b22f1d7806dc5a6a84237e2cb6d3d27dc4764b00a7409b4a5fccf4a32fc80f0201a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-encore \
python39-encore \
python3dist-encore"

RDEPENDS:${PN} += "python-abi"

inherit rpm
