SUMMARY = "Python module to transform tokens into original source code"
DESCRIPTION = "Untokenize transforms tokens into source code. Unlike the standard library's \
tokenize.untokenize(), it preserves the original whitespace between tokens."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-untokenize-0.1.1-2.16.noarch.rpm"
RPM_HASH = "14c164d61e7baf7252f76ab85fbc075bfc22be5d1929feff9013d3915e9f1f3aa20ebd42bbb040422010ccf8526f41fb5613b1661ae75ad628bb05e80d824533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-untokenize \
python39-untokenize \
python3dist-untokenize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
