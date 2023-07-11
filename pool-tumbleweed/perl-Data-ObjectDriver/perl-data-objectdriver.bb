SUMMARY = "Simple, transparent data interface, with caching"
DESCRIPTION = "_Data::ObjectDriver_ is an object relational mapper, meaning that it maps \
object-oriented design concepts onto a relational database. \
 \
It's inspired by, and descended from, the _MT::ObjectDriver_ classes in Six \
Apart's Movable Type and TypePad weblogging products. But it adds in \
caching and partitioning layers, allowing you to spread data across \
multiple physical databases, without your application code needing to know \
where the data is stored."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.22"

RPM_NAME = "perl-Data-ObjectDriver-0.22-1.2.noarch.rpm"
RPM_HASH = "8792e87bc93e133054219729fcb5154e8f0a91e811233b7f8a5d685fffb943d8ae6989be8df7ab1943a5ea250a44135dc305278cb995feeba6984a8a4ec99e69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--ObjectDriver \
perl-Data--ObjectDriver--BaseObject \
perl-Data--ObjectDriver--BaseView \
perl-Data--ObjectDriver--Driver--BaseCache \
perl-Data--ObjectDriver--Driver--Cache--Apache \
perl-Data--ObjectDriver--Driver--Cache--Cache \
perl-Data--ObjectDriver--Driver--Cache--Memcached \
perl-Data--ObjectDriver--Driver--Cache--RAM \
perl-Data--ObjectDriver--Driver--DBD \
perl-Data--ObjectDriver--Driver--DBD--MariaDB \
perl-Data--ObjectDriver--Driver--DBD--Oracle \
perl-Data--ObjectDriver--Driver--DBD--Oracle--db \
perl-Data--ObjectDriver--Driver--DBD--Pg \
perl-Data--ObjectDriver--Driver--DBD--SQLite \
perl-Data--ObjectDriver--Driver--DBD--mysql \
perl-Data--ObjectDriver--Driver--DBI \
perl-Data--ObjectDriver--Driver--GearmanDBI \
perl-Data--ObjectDriver--Driver--MultiPartition \
perl-Data--ObjectDriver--Driver--Multiplexer \
perl-Data--ObjectDriver--Driver--Partition \
perl-Data--ObjectDriver--Driver--SimplePartition \
perl-Data--ObjectDriver--Errors \
perl-Data--ObjectDriver--Iterator \
perl-Data--ObjectDriver--Profiler \
perl-Data--ObjectDriver--ResultSet \
perl-Data--ObjectDriver--SQL \
perl-Data--ObjectDriver--SQL--Oracle \
perl-Data-ObjectDriver"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Accessor--Fast \
perl-Class--Data--Inheritable \
perl-Class--Trigger \
perl-DBI"

inherit rpm
