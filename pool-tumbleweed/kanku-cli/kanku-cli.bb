SUMMARY = "Command line client for kanku"
DESCRIPTION = "Command line client for kanku, mainly used for setup tasks \
and in developer mode."
LICENSE = "GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "kanku-cli-0.14.0-1.5.noarch.rpm"
RPM_HASH = "14509afdcded3f6088c8dc24064778da06896b55b4d4f393da0d045e60c4e2295858898f19feadbf676f6b25707ac931d27adfab8afec02eb123ed72d49d8874"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-cli \
perl-Kanku--Cli \
perl-Kanku--Cli--Roles--Remote \
perl-Kanku--Cli--Roles--RemoteCommand \
perl-Kanku--Cli--Roles--Schema \
perl-Kanku--Cli--Roles--VM \
perl-Kanku--Cli--Roles--View \
perl-Kanku--Cli--api \
perl-Kanku--Cli--ca \
perl-Kanku--Cli--check-configs \
perl-Kanku--Cli--console \
perl-Kanku--Cli--db \
perl-Kanku--Cli--destroy \
perl-Kanku--Cli--init \
perl-Kanku--Cli--ip \
perl-Kanku--Cli--list \
perl-Kanku--Cli--login \
perl-Kanku--Cli--logout \
perl-Kanku--Cli--lsi \
perl-Kanku--Cli--pfwd \
perl-Kanku--Cli--rabbit \
perl-Kanku--Cli--rcomment \
perl-Kanku--Cli--retrigger \
perl-Kanku--Cli--rguest \
perl-Kanku--Cli--rhistory \
perl-Kanku--Cli--rjob \
perl-Kanku--Cli--rr \
perl-Kanku--Cli--rtrigger \
perl-Kanku--Cli--rworker \
perl-Kanku--Cli--setup \
perl-Kanku--Cli--snapshot \
perl-Kanku--Cli--ssh \
perl-Kanku--Cli--startui \
perl-Kanku--Cli--startvm \
perl-Kanku--Cli--status \
perl-Kanku--Cli--stopui \
perl-Kanku--Cli--stopvm \
perl-Kanku--Cli--up \
perl-Kanku--Cli--urlwrapper"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
kanku-common \
libvirt-client \
libvirt-daemon \
libvirt-daemon-driver-qemu \
perl-IO--Interactive \
perl-Net--AMQP--RabbitMQ \
sudo"

inherit rpm
