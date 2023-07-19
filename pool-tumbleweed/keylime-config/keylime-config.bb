SUMMARY = "Configuration file for keylime"
DESCRIPTION = "Subpackage of keylime for the shared configuration files for the agent \
and the server components."
LICENSE = "Apache-2.0 & MIT"

PV = "7.3.0"

RPM_NAME = "keylime-config-7.3.0-1.1.noarch.rpm"
RPM_HASH = "d91c33bca90ba3a804aa79317a22eb77d54b7e9f078d20c24871abddb2c79180003ef479c215cfda96283ae1751650586cec6e2487c5c452e5c77f8b34692c07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-config"

RDEPENDS:${PN} += "python3-keylime"

inherit rpm
