SUMMARY = "Guile bindings to Parted"
DESCRIPTION = "This package provides Guile bindings to GNU Parted."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.7"

RPM_NAME = "guile-parted-0.0.7-2.1.aarch64.rpm"
RPM_HASH = "5bb8548abd48f45681d73afa73082997ec39e081b670f8f5acb28cc558a55a02203063a960980d49ae6894281d52e940994509f343edd510dfc7e7834fe15b0b"

RPROVIDES:${PN} += "guile-parted"

RDEPENDS:${PN} += "guile \
guile-bytestructures \
parted-devel"

inherit rpm
