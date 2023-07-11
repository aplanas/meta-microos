SUMMARY = "Python module to transform tokens into original source code"
DESCRIPTION = "Untokenize transforms tokens into source code. Unlike the standard library's \
tokenize.untokenize(), it preserves the original whitespace between tokens."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-untokenize-0.1.1-2.16.noarch.rpm"
RPM_HASH = "ea958c5160baf4ca38130a45f6b8e3edf0118ce13e4c2338f18d3417941eb4f6807fc1ab53f4cbcc60a7fe06e3945e3e9a7ee17e05a500d83102143eecfd48fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-untokenize \
python310-untokenize \
python3dist-untokenize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
