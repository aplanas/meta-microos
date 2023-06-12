SUMMARY = "Generate HTML or XML in a pythonic way"
DESCRIPTION = "Generate HTML or XML in a pythonic way. \
Pure python alternative to web template engines. \
Can fill HTML forms with default values and error messages."
LICENSE = "LGPL-2.1-only"

PV = "1.15.1"

RPM_NAME = "python310-yattag-1.15.1-1.1.noarch.rpm"
RPM_HASH = "87b1f6e4caea600ca6490aac2e39fb2e421c74f4ddc106b94d644137c810151c8d5cfc5dea539c71abf347cb3923fdd04556f50a1266c7df2881a9c7119cf545"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yattag \
python3.10dist(yattag) \
python310-yattag \
python3dist(yattag)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
