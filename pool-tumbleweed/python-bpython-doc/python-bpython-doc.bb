SUMMARY = "Documentation for python-bpython"
DESCRIPTION = "Documentation and help files for python-bpython."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python-bpython-doc-0.24-2.3.noarch.rpm"
RPM_HASH = "6b3598eda43b5b9af08be2b2027bbc6d0239efecee364546306fecda7975d558f000f654c557241dac9841b31eedb00844016a6ec65a145b465127582346358c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-bpython-doc \
python310-bpython-doc \
python311-bpython-doc \
python39-bpython-doc"

RDEPENDS:${PN} += ""

inherit rpm
