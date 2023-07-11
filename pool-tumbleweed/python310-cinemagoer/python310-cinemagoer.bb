SUMMARY = "Python package to access the IMDb's database"
DESCRIPTION = "cinemagoer is a Python package useful to retrieve and manage the data \
of the IMDb movie database about movies, people, characters and companies. \
 \
cinemagoer can retrieve data from both the IMDb's web server and a local \
copy of the whole database."
LICENSE = "GPL-2.0-or-later"

PV = "2023.5.1"

RPM_NAME = "python310-cinemagoer-2023.5.1-1.3.noarch.rpm"
RPM_HASH = "5e7ce1787a9196c9b4aaaa145d050b1392a1c7fba3a327ba088b50a4b84c1110ece0eeab19f1cec3d89e5a90c9ad5c9bf5cd24c59c0a3519283c6badf6c8b24c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cinemagoer \
python310-IMDbPY \
python310-cinemagoer \
python3dist-cinemagoer"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-SQLAlchemy \
python310-lxml \
update-alternatives"

inherit rpm
