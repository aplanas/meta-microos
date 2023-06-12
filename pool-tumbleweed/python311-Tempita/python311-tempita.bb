SUMMARY = "A very small text templating language"
DESCRIPTION = "Tempita is a small templating language for text substitution. \
 \
This isn't meant to be the Next Big Thing in templating; it's just a \
handy little templating language for when your project outgrows \
string.Template or % substitution.  It's small, it embeds \
Python in strings, and it doesn't do much else."
LICENSE = "MIT"

PV = "0.5.2+git.1630978236.a30af77"

RPM_NAME = "python311-Tempita-0.5.2+git.1630978236.a30af77-1.12.noarch.rpm"
RPM_HASH = "394dc9db7c9f345ffb32ecb4c556167a3cc5f434dd3df5414accb00eed684951e1244f349325331a68fe8e64366d998203ec5e10d7ffe049abdc0d3b5f6d5ea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tempita) \
python311-Tempita \
python3dist(tempita)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
