SUMMARY = "Simple factory objects for SAX namespaced names."
DESCRIPTION = "Simply create a new XML::NamespaceFactory object with the namespace you \
wish to use as its single parameter. If you wish to use the empty \
namespace, simply pass in an empty string (but undef will not do). \
 \
Then, when you want to get a JClark name, call a method on that object the \
name of which is the local name you wish to have. It'll return the JClark \
notation for that local name in your namespace. \
 \
Unfortunately, some local names legal in XML are not legal in Perl. To \
circumvent this, you can use the hash notation in which you access a key on \
the object the name of which is the local name you wish to have. This will \
work just as the method call name but will accept more characters. Note \
that it does not check that the name you ask for is a valid XML name. This \
form is more general but slower. \
 \
If this is not clear, hopefully the SYNOPSIS should help :)"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.02"

RPM_NAME = "perl-XML-NamespaceFactory-1.02-1.27.noarch.rpm"
RPM_HASH = "d2cf200189ca7b4e4abbd6963061fce7817d6a156af7f48e3d6caaad4b469d04b7308a5a0508c6a056e9cb9bd114c4c522ae98f2aa434dc4ac422de2c4b271ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--NamespaceFactory \
perl-XML--NamespaceFactory--TiedHash \
perl-XML-NamespaceFactory"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
