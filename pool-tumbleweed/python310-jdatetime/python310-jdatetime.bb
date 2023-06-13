SUMMARY = "Jalali datetime binding for python"
DESCRIPTION = "jdatetime is the Jalali implementation of Python's datetime module."
LICENSE = "Python-2.0"

PV = "4.1.0"

RPM_NAME = "python310-jdatetime-4.1.0-1.4.noarch.rpm"
RPM_HASH = "89db33f10da019955eb339c8b2bdc431844f67bf106044030e0df314b560d375c484d6f81877e68e7cb5a38b8128a647bcfb0efb6ea076558de69258c9668ce2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jdatetime \
python3.10dist(jdatetime) \
python310-jdatetime \
python3dist(jdatetime)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
