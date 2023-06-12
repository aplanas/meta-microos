SUMMARY = "Documentation for OpenStack serialization library"
DESCRIPTION = "The oslo.serialization library provides support for representing objects \
in transmittable and storable formats, such as Base64, JSON and MessagePack. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "5.0.0"

RPM_NAME = "python-oslo.serialization-doc-5.0.0-1.3.noarch.rpm"
RPM_HASH = "713085d3c95851e197bb03d2c40fca2ba6ddc115c0e1c123cb02fc3739d14cb930ab75acc566d6dc6dac4bef76246695eb1d40c98d41d85eb94ae7ef1a7b57a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.serialization-doc"
RDEPENDS:${PN} += ""

inherit rpm
