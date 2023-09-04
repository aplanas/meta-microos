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

RPM_NAME = "python310-pandas-all-2.0.3-1.2.noarch.rpm"
RPM_HASH = "9b5ec1b74358a0324e04082bd52d0ed01215b323cc8e503a66bf98c47fa412318eb28df908a5c6db4c0141b2998f777d0406f1f52f6b73433691bcdd01d04040"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-all"

RDEPENDS:${PN} += "python310-Bottleneck \
python310-Jinja2 \
python310-PyMySQL \
python310-PyQt5 \
python310-QtPy \
python310-SQLAlchemy \
python310-XlsxWriter \
python310-beautifulsoup4 \
python310-blosc \
python310-brotlipy \
python310-fastparquet \
python310-fsspec \
python310-gcsfs \
python310-html5lib \
python310-hypothesis \
python310-lxml \
python310-matplotlib \
python310-numba \
python310-numexpr \
python310-odfpy \
python310-openpyxl \
python310-pandas \
python310-psycopg2 \
python310-pyarrow \
python310-pyreadstat \
python310-pytest \
python310-pytest-asyncio \
python310-pytest-xdist \
python310-python-snappy \
python310-scipy \
python310-tables \
python310-tabulate \
python310-xarray \
python310-xlrd \
python310-zstandard"

inherit rpm
