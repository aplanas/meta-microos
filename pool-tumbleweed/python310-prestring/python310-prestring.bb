SUMMARY = "Python source code generation library"
DESCRIPTION = "Python source code generation library (with overuse with-syntax)."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-prestring-0.9.0-2.12.noarch.rpm"
RPM_HASH = "ef1b694a7758358bb1de06ff59a39a6271ca75045b36f21e5aa77b5b4c881b8f6c80297d73de05818b98de46ca2b1cbff87623e7b23fb8ed091b2128d61af1fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-prestring \
python310-prestring \
python3dist-prestring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
