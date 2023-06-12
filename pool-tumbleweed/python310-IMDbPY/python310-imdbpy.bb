SUMMARY = "Python package to access the IMDb's database"
DESCRIPTION = "IMDbPY is a Python package useful to retrieve and manage the data \
of the IMDb movie database about movies, people, characters and companies. \
 \
IMDbPY can retrieve data from both the IMDb's web server and a local \
copy of the whole database."
LICENSE = "GPL-2.0-or-later"

PV = "2021.4.18"

RPM_NAME = "python310-IMDbPY-2021.4.18-1.12.noarch.rpm"
RPM_HASH = "cb59b09c581cbae804bf9ef1997754c6f29d8f49d5105e30d8583a98983e07dd09d53f46aa35ab2a54cef8d82b0fa4720c8082e9491b4c86f16580b7ade82b74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-IMDbPY \
python3.10dist(imdbpy) \
python310-IMDbPY \
python3dist(imdbpy)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-SQLAlchemy \
python310-lxml \
update-alternatives"

inherit rpm
