SUMMARY = "The python pandas[all] extra"
DESCRIPTION = "This package provides most the [all] extra for python-pandas \
 \
Some requirements defined in the PyPI package are left out \
because they are not available as openSUSE RPM packages: \
 \
  * pandas-gbq \
  * pyxlsb \
  * s3fs \
 \
You can install them directly through `pip3 install --user`, if needed."
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-all-2.0.3-1.2.noarch.rpm"
RPM_HASH = "4535e6d94a7d7a44e8193fcf9fd3a4c91914860991dd9ebbe58f5eaeafef40f752edfd62ed99715cbcd7a7f63ffc4d2cef025f0b38345b9f2b6325f848a14151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-all"

RDEPENDS:${PN} += "python39-Bottleneck \
python39-Jinja2 \
python39-PyMySQL \
python39-PyQt5 \
python39-QtPy \
python39-SQLAlchemy \
python39-XlsxWriter \
python39-beautifulsoup4 \
python39-blosc \
python39-brotlipy \
python39-fastparquet \
python39-fsspec \
python39-gcsfs \
python39-html5lib \
python39-hypothesis \
python39-lxml \
python39-matplotlib \
python39-numba \
python39-numexpr \
python39-odfpy \
python39-openpyxl \
python39-pandas \
python39-psycopg2 \
python39-pyarrow \
python39-pyreadstat \
python39-pytest \
python39-pytest-asyncio \
python39-pytest-xdist \
python39-python-snappy \
python39-scipy \
python39-tables \
python39-tabulate \
python39-xarray \
python39-xlrd \
python39-zstandard"

inherit rpm
