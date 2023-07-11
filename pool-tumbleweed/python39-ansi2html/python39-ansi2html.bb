SUMMARY = "Python module to convert text with ANSI color codes to HTML or LaTeX"
DESCRIPTION = "A module to convert text with ANSI color codes to HTML or to LaTeX."
LICENSE = "LGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "python39-ansi2html-1.8.0-2.3.noarch.rpm"
RPM_HASH = "85e4007bd374d32d6016afe2ea619001f96273941eb4bee33850ed34d33dda8253b92407512999f709962c5fd6cb006c36f0638e4ebe5a5895f420cfef7f95a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ansi2html \
python39-ansi2html \
python3dist-ansi2html"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-six \
update-alternatives"

inherit rpm
