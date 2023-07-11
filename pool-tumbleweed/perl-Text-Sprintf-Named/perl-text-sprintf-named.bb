SUMMARY = "Sprintf-like function with named conversions"
DESCRIPTION = "Text::Sprintf::Named provides a sprintf equivalent with named conversions. \
Named conversions are sprintf field specifiers (like ''%s'' or ''%4d'') \
only they are associated with the key of an associative array of \
parameters. So for example ''s'' will emit the ''name'' parameter as \
a string, and ''4d'' will emit the ''num'' parameter as a variable \
with a width of 4."
LICENSE = "MIT"

PV = "0.0405"

RPM_NAME = "perl-Text-Sprintf-Named-0.0405-1.13.noarch.rpm"
RPM_HASH = "739908ea51434a8704dcaf1a41801930727fb803e7394eea25161c180483a4a57c71ac7b625ad6838564fffd5dd29645f3389ccfa1c16eb732fc86bc7cdeebfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Sprintf--Named \
perl-Text-Sprintf-Named"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-parent"

inherit rpm
