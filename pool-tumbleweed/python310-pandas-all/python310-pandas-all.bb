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

RPM_NAME = "python310-pandas-all-2.0.3-1.3.noarch.rpm"
RPM_HASH = "d38ab09ad2c45b1593a8b0d32b53f39c259c5e908ccdb856dce8d5c95f337f91f94ea91edb80092b7736a21630d638e48880a21fc8386f0e1dd0e722668130d7"
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
