SUMMARY = "Python module to transform tokens into original source code"
DESCRIPTION = "Untokenize transforms tokens into source code. Unlike the standard library's \
tokenize.untokenize(), it preserves the original whitespace between tokens."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python311-untokenize-0.1.1-2.16.noarch.rpm"
RPM_HASH = "af43a1ae3fbb6f811e358b32878aa07334daccc75ce0ce725f6246016253208bad4aec72f9b459bc29f4f16320e266fa6204b82fdbae9a37bff11e7ef2aab40b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-untokenize \
python3.11dist-untokenize \
python311-untokenize \
python3dist-untokenize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
