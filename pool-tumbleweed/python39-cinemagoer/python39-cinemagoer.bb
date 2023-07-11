SUMMARY = "Python package to access the IMDb's database"
DESCRIPTION = "cinemagoer is a Python package useful to retrieve and manage the data \
of the IMDb movie database about movies, people, characters and companies. \
 \
cinemagoer can retrieve data from both the IMDb's web server and a local \
copy of the whole database."
LICENSE = "GPL-2.0-or-later"

PV = "2023.5.1"

RPM_NAME = "python39-cinemagoer-2023.5.1-1.3.noarch.rpm"
RPM_HASH = "2d6bcd142869770d5b2eb5d0af156029bd5ff8cb23521175ca18438b383a71cb50624f6e5e97e3b8ec6672e761c01b56ade433a95911e8e7c7dfa40d2dd9028c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cinemagoer \
python39-IMDbPY \
python39-cinemagoer \
python3dist-cinemagoer"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-SQLAlchemy \
python39-lxml \
update-alternatives"

inherit rpm
