SUMMARY = "RPM macros for building cups drivers"
DESCRIPTION = "RPM helper scripts to create automatic 'Provides:' tags for printer \
driver RPMs."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "cups-rpm-helper-2.0.1-2.10.aarch64.rpm"
RPM_HASH = "1cc7a65cdab649cb6608afa7dd5b6904e71fc4c146a7604b4e78ede14028857405a9e088d984de68abd75c5358c2824f9379ba5b9272896114d5c134681e870b"

RPROVIDES:${PN} += "cups-rpm-helper"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-cups \
rpm-build"

inherit rpm
