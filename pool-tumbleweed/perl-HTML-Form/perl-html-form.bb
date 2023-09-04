SUMMARY = "Class that represents an HTML form element"
DESCRIPTION = "Objects of the 'HTML::Form' class represents a single HTML '<form> ... \
</form>' instance. A form consists of a sequence of inputs that usually \
have names, and which can take on various values. The state of a form can \
be tweaked and it can then be asked to provide HTTP::Request objects that \
can be passed to the request() method of LWP::UserAgent."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.11"

RPM_NAME = "perl-HTML-Form-6.11-1.3.noarch.rpm"
RPM_HASH = "c36577b0e6897ac44432fede46dfceee1c673825815c5c9f9dddf59ffac4cc9e3b649a384004d994143b1070ee7b3f2a690160e5f38e857874d4a3dca5d36fcf"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTML--TokeParser \
perl-HTTP--Request \
perl-HTTP--Request--Common \
perl-Test--More \
perl-URI \
perl-parent"

inherit rpm
