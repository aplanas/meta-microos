SUMMARY = "Glimpse at an Enlightened Perl: Exception Handling"
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

RPM_NAME = "perl-Task-Kensho-Exceptions-0.41-1.10.noarch.rpm"
RPM_HASH = "be616e146cafbdc4e26d124b76d5cbdf7fffac8336abea26f588045c9994ee5e3863150060837c730a7aeec539ea279f32f408b802a1e6756a80d67ea4d14fcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Task--Kensho--Exceptions \
perl-Task-Kensho-Exceptions"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Syntax--Keyword--Try \
perl-Try--Tiny \
perl-autodie"

inherit rpm
