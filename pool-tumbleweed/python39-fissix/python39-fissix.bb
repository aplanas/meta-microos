SUMMARY = "Backport of lib2to3, with enhancements"
DESCRIPTION = "Backport of latest lib2to3, with enhancements."
LICENSE = "Python-2.0"

PV = "21.11.13"

RPM_NAME = "python39-fissix-21.11.13-1.15.noarch.rpm"
RPM_HASH = "99e9d367da06146331c0391e79ef7b3e3c1ddcd459e3354b414b877ba420bb75b59f69f17d1395741267bea617fd0b357ad9783b308f1f7dd2144453380c3258"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fissix \
python39-fissix \
python3dist-fissix"

RDEPENDS:${PN} += "python-abi \
python39-appdirs"

inherit rpm
