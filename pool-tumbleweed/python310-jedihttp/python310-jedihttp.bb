SUMMARY = "HTTP/JSON wrapper around Jedi"
DESCRIPTION = "HTTP/JSON wrapper around Jedi primarily created to allow using \
jedi for python3 completion in YouCompleteMe."
LICENSE = "Apache-2.0"

PV = "0+git.1497381496.75b8b74"

RPM_NAME = "python310-jedihttp-0+git.1497381496.75b8b74-5.9.noarch.rpm"
RPM_HASH = "577610fd1ea6acd84056ec839896c6fc50392df03283f632be8751a6a5979a7dc4e4dff1c668489d402a253fa88fc0c73aeb51ecd7434c99dc400b90951d42f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jedihttp \
python3.10dist-jedihttp \
python310-jedihttp \
python3dist-jedihttp"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-bottle \
python310-jedi \
python310-waitress \
update-alternatives"

inherit rpm
