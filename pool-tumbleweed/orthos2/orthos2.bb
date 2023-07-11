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

RPM_NAME = "orthos2-1.2.169+git.a693485-1.2.noarch.rpm"
RPM_HASH = "15e5db0092c57ec3f34c03be6c659dd5495da8e172c9e133d133bb421c85572cecb20566d0113c4741eebdaec3f3702c814e3543daaf0119234a29baac3890a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-orthos2 \
orthos2 \
orthos2-1.2.169+git.a693485-1.2 \
python3.11dist-orthos2 \
python3dist-orthos2"

RDEPENDS:${PN} += "/sbin/service \
/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
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
