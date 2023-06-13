SUMMARY = "Glimpse at an Enlightened Perl: XML Development"
DESCRIPTION = "From http://en.wikipedia.org/wiki/Kensho: \
 \
    Kenshō (見性) (C. Wu) is a Japanese term for enlightenment experiences - \
    most commonly used within the confines of Zen Buddhism - literally \
    meaning 'seeing one's nature'[1] or 'true self.'[2] It generally \
    'refers to the realization of nonduality of subject and object.'[3] \
 \
Task::Kensho is a list of recommended modules for Enlightened Perl \
development. CPAN is wonderful, but there are too many wheels and you have \
to pick and choose amongst the various competing technologies. \
 \
The plan is for Task::Kensho to be a rough testing ground for ideas that go \
into among other things the Enlightened Perl Organisation Extended Core \
(EPO-EC). \
 \
The modules that are bundled by Task::Kensho are broken down into several \
categories and are still being considered. They are all taken from various \
top 100 most used perl modules lists and from discussions with various \
subject matter experts in the Perl Community. That said, this bundle does \
_not_ follow the guidelines established for the EPO-EC for peer review via \
industry advisers. \
 \
Starting in 2011, Task::Kensho split its sub-groups of modules into \
individually-installable tasks. Each Task::Kensho sub-task is listed at the \
beginning of its section in this documentation. \
 \
When installing Task::Kensho itself, you will be asked to install each \
sub-task in turn, or you can install individual tasks separately. These \
individual tasks will always install all their modules by default. This \
facilitates the ease and simplicity the distribution aims to achieve."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.41"

RPM_NAME = "perl-Task-Kensho-XML-0.41-1.9.noarch.rpm"
RPM_HASH = "0ab8447c2f25281d5d20a0eaf6d3131810d18c51dca3140ae0b2d9c79ae5e582c87e5e71cd2ea548fcec5c4d262d2d8fde70d82ea048318b8bcc9b64298aca45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Task::Kensho::XML) \
perl-Task-Kensho-XML"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(XML::Generator::PerlData) \
perl(XML::LibXML) \
perl(XML::LibXSLT) \
perl(XML::SAX) \
perl(XML::SAX::Writer)"

inherit rpm
