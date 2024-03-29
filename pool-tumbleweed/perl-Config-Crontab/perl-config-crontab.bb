SUMMARY = "Read/Write Vixie compatible crontab(5) files"
DESCRIPTION = "*Config::Crontab* provides an object-oriented interface to Vixie-style \
crontab(5) files for Perl. \
 \
A *Config::Crontab* object allows you to manipulate an ordered set of \
*Event*, *Env*, or *Comment* objects (also included with this package). \
Descriptions of these packages may be found below. \
 \
In short, *Config::Crontab* reads and writes crontab(5) files (and does a \
little pretty-printing too) using objects. The general idea is that you \
create a *Config::Crontab* object and associate it with a file (if \
unassociated, it will work over a pipe to 'crontab -l'). From there, you \
can add lines to your crontab object, change existing line attributes, and \
write everything back to file. \
 \
Now, to successfully navigate the module's ins and outs, we'll need a \
little terminology lesson."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.45"

RPM_NAME = "perl-Config-Crontab-1.45-1.25.noarch.rpm"
RPM_HASH = "89e9ca267c6e52ccb1ebec2df175706b1423481b340d0bc3b0ba7eddbdce00fa3b7c4ee1f8b01867df0d3015da9aa0ba81cbf638ce4d295f7845d612e4cf2b97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--Crontab \
perl-Config--Crontab--Base \
perl-Config--Crontab--Block \
perl-Config--Crontab--Comment \
perl-Config--Crontab--Container \
perl-Config--Crontab--Env \
perl-Config--Crontab--Event \
perl-Config-Crontab"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
