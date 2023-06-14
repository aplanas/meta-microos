SUMMARY = "Machine administration"
DESCRIPTION = "Orthos is the machine administration tool of the development network at SUSE. It is used for following tasks: \
 \
    getting the state of the machine \
    overview about the hardware \
    overview about the installed software (installations) \
    reservation of the machines \
    generating the DHCP configuration (via Cobbler) \
    reboot the machines remotely \
    managing remote (serial) consoles"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.169+git.a693485"

RPM_NAME = "orthos2-1.2.169+git.a693485-1.1.noarch.rpm"
RPM_HASH = "a1af3b82b6e68cc3993abc3157459716dea0f05e720b248e467f77806e02936d956513412a63e5dbf010d63715f58867fd2c3f4db6da1c1175a3be9a9d956345"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-orthos2 \
orthos2 \
orthos2-1.2.169+git.a693485-1.1 \
python3.10dist-orthos2 \
python3dist-orthos2"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/sbin/service \
/usr/bin/perl \
ansible \
logrotate \
nginx \
python-abi \
python3-Django \
python3-django-auth-ldap \
python3-django-extensions \
python3-djangorestframework \
python3-ldap \
python3-netaddr \
python3-paramiko \
python3-psycopg2 \
python3-validators \
sudo \
uwsgi \
uwsgi-python3"

inherit rpm
