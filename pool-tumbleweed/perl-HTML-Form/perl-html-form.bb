SUMMARY = "Class that represents an HTML form element"
DESCRIPTION = "Objects of the 'HTML::Form' class represents a single HTML '<form> ... \
</form>' instance. A form consists of a sequence of inputs that usually \
have names, and which can take on various values. The state of a form can \
be tweaked and it can then be asked to provide HTTP::Request objects that \
can be passed to the request() method of LWP::UserAgent."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.11"

RPM_NAME = "perl-HTML-Form-6.11-1.1.noarch.rpm"
RPM_HASH = "0746fe8e8d474535c694f45ed45b4572c4d800bc23818b8399facb63f708d93adc12ebde5f524a0a81051b7ae727176dc9f37e80f3d70d50f73bd795b166b26a"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-HTML--TokeParser \
perl-HTTP--Request \
perl-HTTP--Request--Common \
perl-Test--More \
perl-URI \
perl-parent"

inherit rpm
