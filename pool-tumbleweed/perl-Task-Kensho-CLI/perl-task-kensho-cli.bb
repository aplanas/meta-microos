SUMMARY = "Glimpse at an Enlightened Perl: Useful Command-line Tools"
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

RPM_NAME = "perl-Task-Kensho-CLI-0.41-1.11.noarch.rpm"
RPM_HASH = "05773fb3ccff517dd31791a221a6a91804e09866bc078e664b931c1ec3d7c8aa50b48910a75e25147f9375deef181bdd1d145d64b9d131589767550326c4c4f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Task--Kensho--CLI \
perl-Task-Kensho-CLI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-App--Ack \
perl-App--Nopaste \
perl-Module--CoreList \
perl-Reply"

inherit rpm
