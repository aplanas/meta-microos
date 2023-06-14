SUMMARY = "Python module to parse human-readable date/time text"
DESCRIPTION = "A Python module to parse human-readable date/time strings."
LICENSE = "Apache-2.0"

PV = "2.6"

RPM_NAME = "python311-parsedatetime-2.6-2.8.noarch.rpm"
RPM_HASH = "d16683e70fc704169ccada6d55258ec54eafffd1322b981b43723ef552e6d3a9c44f9f8fb899f06dfe2e8810314775c68c2e66bc644849344a83f17e219e4cad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-parsedatetime \
python311-parsedatetime \
python3dist-parsedatetime"

RDEPENDS:${PN} += "python-abi"

inherit rpm
