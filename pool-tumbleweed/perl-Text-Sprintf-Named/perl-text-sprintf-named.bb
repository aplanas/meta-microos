SUMMARY = "Sprintf-like function with named conversions"
DESCRIPTION = "Text::Sprintf::Named provides a sprintf equivalent with named conversions. \
Named conversions are sprintf field specifiers (like ''%s'' or ''%4d'') \
only they are associated with the key of an associative array of \
parameters. So for example ''s'' will emit the ''name'' parameter as \
a string, and ''4d'' will emit the ''num'' parameter as a variable \
with a width of 4."
LICENSE = "MIT"

PV = "0.0405"

RPM_NAME = "perl-Text-Sprintf-Named-0.0405-1.14.noarch.rpm"
RPM_HASH = "551b3f31188167fabae704051c8863ffb5ff4817236c9aaeea3157d70edd44643a57bcf06ec8c7231ce9f4443c7d9573f092929dcb78b09d4e0e44073232b6f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Sprintf--Named \
perl-Text-Sprintf-Named"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-parent"

inherit rpm
