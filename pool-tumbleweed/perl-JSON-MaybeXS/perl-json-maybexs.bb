SUMMARY = "Use Cpanel::JSON::XS with a fallback to JSON::XS and JSON::PP"
DESCRIPTION = "This module first checks to see if either Cpanel::JSON::XS or JSON::XS (at \
at least version 3.0) is already loaded, in which case it uses that module. \
Otherwise it tries to load Cpanel::JSON::XS, then JSON::XS, then JSON::PP \
in order, and either uses the first module it finds or throws an error. \
 \
It then exports the 'encode_json' and 'decode_json' functions from the \
loaded module, along with a 'JSON' constant that returns the class name for \
calling 'new' on. \
 \
If you're writing fresh code rather than replacing JSON.pm usage, you might \
want to pass options as constructor args rather than calling mutators, so \
we provide our own 'new' method that supports that."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.004005"

RPM_NAME = "perl-JSON-MaybeXS-1.004005-1.2.noarch.rpm"
RPM_HASH = "5a0514642fc53cfa3157792bace79e9979a0700823067170258bc128a3dfb5158d447dc7ddc4183b3c9cac3897d82e24b72bb5a338df67f2f8ed5dba53939210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-JSON--MaybeXS \
perl-JSON-MaybeXS"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Cpanel--JSON--XS \
perl-JSON--PP"

inherit rpm
