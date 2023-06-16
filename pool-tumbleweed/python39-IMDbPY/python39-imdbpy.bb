SUMMARY = "Python package to access the IMDb's database"
DESCRIPTION = "IMDbPY is a Python package useful to retrieve and manage the data \
of the IMDb movie database about movies, people, characters and companies. \
 \
IMDbPY can retrieve data from both the IMDb's web server and a local \
copy of the whole database."
LICENSE = "GPL-2.0-or-later"

PV = "2021.4.18"

RPM_NAME = "python39-IMDbPY-2021.4.18-1.12.noarch.rpm"
RPM_HASH = "007f1f4763cdc294e1e008509e6a91703e87597598a7a91e6fb36a109b40698acbf7126f97540db9546d9506c8a5e1139396a208f54bf04db777e6c7f13bf41b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-imdbpy \
python39-IMDbPY \
python3dist-imdbpy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-SQLAlchemy \
python39-lxml \
update-alternatives"

inherit rpm
