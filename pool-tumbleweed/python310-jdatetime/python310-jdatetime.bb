SUMMARY = "Jalali datetime binding for python"
DESCRIPTION = "jdatetime is the Jalali implementation of Python's datetime module."
LICENSE = "Python-2.0"

PV = "4.1.0"

RPM_NAME = "python310-jdatetime-4.1.0-1.6.noarch.rpm"
RPM_HASH = "f47164dd814e41e7633fbfe769ad1ff29894a04cc013002660cf34512cf91d4a599e62df1321459137b30cbd976bb1e41d0cdee356d48f2e59ef7b559d87df33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jdatetime \
python310-jdatetime \
python3dist-jdatetime"

RDEPENDS:${PN} += "python-abi"

inherit rpm
