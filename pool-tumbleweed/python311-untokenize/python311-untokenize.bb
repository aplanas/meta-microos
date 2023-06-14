SUMMARY = "Python module to transform tokens into original source code"
DESCRIPTION = "Untokenize transforms tokens into source code. Unlike the standard library's \
tokenize.untokenize(), it preserves the original whitespace between tokens."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-untokenize-0.1.1-2.15.noarch.rpm"
RPM_HASH = "50c83b55c38d109e657fc0ef10fd5fa9d37673d886b88138e2783819f8fec586e04b27ccf486c25b19c78e7303bf8cf31d1d6c46cc5bc6cf5abdd6b9f76b4809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-untokenize \
python311-untokenize \
python3dist-untokenize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
