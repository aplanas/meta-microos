SUMMARY = "The python pandas[parquet] extra"
DESCRIPTION = "This package provides the [parquet] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-parquet-2.0.3-1.3.noarch.rpm"
RPM_HASH = "45eaf976af224b798c3529403ba56a98ef054b83f1cda0f579e1052fec028f83060b781fff75985561674c2404fc3fb942165ac0f70769e2b93bb2822cd41ed5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-parquet \
python311-pandas-parquet"

RDEPENDS:${PN} += "python311-pandas \
python311-pyarrow"

inherit rpm
