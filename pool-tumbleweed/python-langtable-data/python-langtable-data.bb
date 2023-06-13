SUMMARY = "XML data to map various locale settingsn and its relations"
DESCRIPTION = "Provides XML data used by python-langtable. Packaged separately so it is not affected \
by more python target versions and also it can be used indenpendently."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.61"

RPM_NAME = "python-langtable-data-0.0.61-2.1.noarch.rpm"
RPM_HASH = "2a7685fff84036cbfe307a915f09f1ecf06d798e100c7b939b0821808fb1bc27ae9b627ec7f34bcb9d0c58a17316904c7f15f48123ff4c55e09be0a473503020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-langtable-data"

RDEPENDS:${PN} += ""

inherit rpm
