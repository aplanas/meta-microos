SUMMARY = "Python package to access the IMDb's database"
DESCRIPTION = "IMDbPY is a Python package useful to retrieve and manage the data \
of the IMDb movie database about movies, people, characters and companies. \
 \
IMDbPY can retrieve data from both the IMDb's web server and a local \
copy of the whole database."
LICENSE = "GPL-2.0-or-later"

PV = "2021.4.18"

RPM_NAME = "python311-IMDbPY-2021.4.18-1.12.noarch.rpm"
RPM_HASH = "c7a77556b74bad9cec4a1e2719402ea6452596d2a4493394154bfaa4d905b58702c22fc99699b1bc2ff7b7859862db28fd1746cb84aec3342d9d3f385d600d4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-imdbpy \
python311-IMDbPY \
python3dist-imdbpy"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-SQLAlchemy \
python311-lxml \
update-alternatives"

inherit rpm
