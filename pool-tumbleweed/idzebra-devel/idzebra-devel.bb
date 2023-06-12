SUMMARY = "Fielded Free Text Engine with a Z39.50 Frontend"
DESCRIPTION = "Zebra is a fielded free text indexing and retrieval engine with a \
Z39.50 front-end. You can use any compatible, commercial, or freeware \
Z39.50 client to access data stored in Zebra."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.7"

RPM_NAME = "idzebra-devel-2.2.7-1.1.aarch64.rpm"
RPM_HASH = "a85b9cba8ea0c046ffb0517b7483c05ef9dde599de82585d558fd782f52968d85d1e0cacd01b7f506104f38b3fafa0aa95ec4221ce79213d9066143ccfe39b57"

RPROVIDES:${PN} += "idzebra-devel \
idzebra-devel(aarch-64) \
pkgconfig(zebra)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
idzebra \
libyaz-devel \
pkgconfig(yaz-icu) \
pkgconfig(yaz-server)"

inherit rpm
