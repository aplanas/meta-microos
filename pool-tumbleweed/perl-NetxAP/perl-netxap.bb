SUMMARY = "Interface to the protocol family IMAP, IMSP, ACAP, and ICAP"
DESCRIPTION = "This module provides an interface to the protocol family represented by \
IMAP, IMSP, ACAP, and ICAP.  A usable IMAP module is also provide."
LICENSE = "Artistic-1.0"

PV = "0.02"

RPM_NAME = "perl-NetxAP-0.02-722.31.aarch64.rpm"
RPM_HASH = "ba8e0a4d0d43204990a4ed6435295db64d212ff9e140d757ecc61650c2f52c9e017fbf0aeaf24e48afe1b3dc39fbdf06786a6b692fd7604b974a62dcfa717631"

RPROVIDES:${PN} += "p-netxap \
perl-Net--IMAP \
perl-Net--IMAP--Acl \
perl-Net--IMAP--Addr \
perl-Net--IMAP--Bad \
perl-Net--IMAP--BodyStructure \
perl-Net--IMAP--Bodypart \
perl-Net--IMAP--Bye \
perl-Net--IMAP--Capability \
perl-Net--IMAP--Cond \
perl-Net--IMAP--Envelope \
perl-Net--IMAP--Exists \
perl-Net--IMAP--Expunge \
perl-Net--IMAP--Fetch \
perl-Net--IMAP--FetchData \
perl-Net--IMAP--Flags \
perl-Net--IMAP--List \
perl-Net--IMAP--Listrights \
perl-Net--IMAP--Lsub \
perl-Net--IMAP--Multipart \
perl-Net--IMAP--Myrights \
perl-Net--IMAP--Namespace \
perl-Net--IMAP--No \
perl-Net--IMAP--Ok \
perl-Net--IMAP--Quota \
perl-Net--IMAP--Quotaroot \
perl-Net--IMAP--Recent \
perl-Net--IMAP--Response \
perl-Net--IMAP--Search \
perl-Net--IMAP--Status \
perl-Net--IMAP--UntaggedResponse \
perl-Net--xAP \
perl-Net--xAP--Response \
perl-NetxAP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Digest-HMAC"

inherit rpm
