SUMMARY = "Class that represents an HTML form element"
DESCRIPTION = "Objects of the 'HTML::Form' class represents a single HTML '<form> ... \
</form>' instance. A form consists of a sequence of inputs that usually \
have names, and which can take on various values. The state of a form can \
be tweaked and it can then be asked to provide HTTP::Request objects that \
can be passed to the request() method of LWP::UserAgent."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.11"

RPM_NAME = "perl-HTML-Form-6.11-1.2.noarch.rpm"
RPM_HASH = "7de18fc886e2fa755576759dff347aec1b16c36a14e30489742800c0701d19059f4abf154f84128227971dde56595fc47098492d541b0135d7fda6d8f78bcc11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--Form \
perl-HTML--Form--FileInput \
perl-HTML--Form--IgnoreInput \
perl-HTML--Form--ImageInput \
perl-HTML--Form--Input \
perl-HTML--Form--KeygenInput \
perl-HTML--Form--ListInput \
perl-HTML--Form--SubmitInput \
perl-HTML--Form--TextInput \
perl-HTML-Form"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-HTML--TokeParser \
perl-HTTP--Request \
perl-HTTP--Request--Common \
perl-Test--More \
perl-URI \
perl-parent"

inherit rpm
