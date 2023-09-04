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

RPM_NAME = "python311-pandas-all-2.0.3-1.2.noarch.rpm"
RPM_HASH = "a7274c387f4cf7abb8429a6548bc9ef342695309566571e47f40b3b027eaba61af78e39e5f3977e9c206b8845d0520164da481ffcbc8c3accb43452d69aa5818"
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
python311-brotlipy \
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
python311-python-snappy \
python311-scipy \
python311-tables \
python311-tabulate \
python311-xarray \
python311-xlrd \
python311-zstandard"

inherit rpm
