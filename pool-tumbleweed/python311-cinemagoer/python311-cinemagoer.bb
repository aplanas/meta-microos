SUMMARY = "Python package to access the IMDb's database"
DESCRIPTION = "cinemagoer is a Python package useful to retrieve and manage the data \
of the IMDb movie database about movies, people, characters and companies. \
 \
cinemagoer can retrieve data from both the IMDb's web server and a local \
copy of the whole database."
LICENSE = "GPL-2.0-or-later"

PV = "2023.5.1"

RPM_NAME = "python311-cinemagoer-2023.5.1-1.3.noarch.rpm"
RPM_HASH = "6b5f95f429f40e36cb9feada9d0bd57ed0852631595c1d7cf30755f33cacf1ffac2c61d1baffd10cefeef7e81fce6211869e72f34dd8d32be97aeb1fd7a63870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-IMDbPY \
python3-cinemagoer \
python3.11dist-cinemagoer \
python311-IMDbPY \
python311-cinemagoer \
python3dist-cinemagoer"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-SQLAlchemy \
python311-lxml \
update-alternatives"

inherit rpm
