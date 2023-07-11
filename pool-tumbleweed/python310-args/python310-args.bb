SUMMARY = "Python command argument interface"
DESCRIPTION = "This module gives developers an interface for command line argumemnts."
LICENSE = "BSD-2-Clause"

PV = "0.1.0"

RPM_NAME = "python310-args-0.1.0-2.16.noarch.rpm"
RPM_HASH = "aa2a3f5f786222f818713e71f7e1113b52817d2be964dd1c9607eb428c8f6a743dc21ea3832c6fd82dd145e678703652cbd2d56e87d8a2829f29330715e5072d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-args \
python310-args \
python3dist-args"

RDEPENDS:${PN} += "python-abi"

inherit rpm
