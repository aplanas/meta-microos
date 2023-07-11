SUMMARY = "A very small text templating language"
DESCRIPTION = "Tempita is a small templating language for text substitution. \
 \
This isn't meant to be the Next Big Thing in templating; it's just a \
handy little templating language for when your project outgrows \
string.Template or % substitution.  It's small, it embeds \
Python in strings, and it doesn't do much else."
LICENSE = "MIT"

PV = "0.5.2+git.1630978236.a30af77"

RPM_NAME = "python39-Tempita-0.5.2+git.1630978236.a30af77-1.14.noarch.rpm"
RPM_HASH = "5186301ab27f3cbd213ba7efcea6edb858005230e0ebb4e5fdf52acf046299ad5adbb90d9ff0258b5fad87b91cff88e85d6d3569ede5753b13a2574ff664398a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tempita \
python39-Tempita \
python3dist-tempita"

RDEPENDS:${PN} += "python-abi"

inherit rpm
