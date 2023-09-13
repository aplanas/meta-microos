SUMMARY = "The python pandas[all] extra"
DESCRIPTION = "This package provides most the [all] extra for python-pandas \
 \
Some requirements defined in the PyPI package are left out \
because they are not available as openSUSE RPM packages: \
 \
  * pandas-gbq \
  * pyxlsb \
  * s3fs \
  * dataframe-api-compat \
 \
You can install them directly through `pip3 install --user`, if needed."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-pandas-all-2.1.0-1.2.noarch.rpm"
RPM_HASH = "0a5911bf6079bacfa73b795b2b76a0befcbfabb1ec15de2a6a5cfe108b8c5c0a7e8d7523f960098e71bbbb6ecaf84c989c0332e233524bfc7851132b15c5ac87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-all \
python311-pandas-all"

RDEPENDS:${PN} += "python311-Bottleneck \
python311-Jinja2 \
python311-PyMySQL \
python311-PyQt5 \
python311-QtPy \
python311-SQLAlchemy \
python311-XlsxWriter \
python311-beautifulsoup4 \
python311-blosc \
python311-fastparquet \
python311-fsspec \
python311-gcsfs \
python311-html5lib \
python311-hypothesis \
python311-lxml \
python311-matplotlib \
python311-numba \
python311-numexpr \
python311-odfpy \
python311-openpyxl \
python311-pandas \
python311-psycopg2 \
python311-pyarrow \
python311-pyreadstat \
python311-pytest \
python311-pytest-asyncio \
python311-pytest-xdist \
python311-scipy \
python311-tables \
python311-tabulate \
python311-xarray \
python311-xlrd \
python311-zstandard"

inherit rpm
