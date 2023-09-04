SUMMARY = "Unified cache handling interface"
DESCRIPTION = "CHI provides a unified caching API, designed to assist a developer in \
persisting data for a specified period of time. \
 \
The CHI interface is implemented by driver classes that support fetching, \
storing and clearing of data. Driver classes exist or will exist for the \
gamut of storage backends available to Perl, such as memory, plain files, \
memory mapped files, memcached, and DBI. \
 \
CHI is intended as an evolution of DeWitt Clinton's Cache::Cache package, \
adhering to the basic Cache API but adding new features and addressing \
limitations in the Cache::Cache implementation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.61"

RPM_NAME = "perl-CHI-0.61-1.10.noarch.rpm"
RPM_HASH = "794c64a97415cfc536da899a5838022601f8eeacf3da858652f9d99f039e2390ad53ba3f0a13d12ede1df0e74910607be03801891efc351da2d84a98fafa6652"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Bar \
perl-Baz \
perl-CHI \
perl-CHI--CacheObject \
perl-CHI--Constants \
perl-CHI--Driver \
perl-CHI--Driver--Base--CacheContainer \
perl-CHI--Driver--CacheCache \
perl-CHI--Driver--FastMmap \
perl-CHI--Driver--File \
perl-CHI--Driver--Memory \
perl-CHI--Driver--Metacache \
perl-CHI--Driver--Null \
perl-CHI--Driver--RawMemory \
perl-CHI--Driver--Role--HasSubcaches \
perl-CHI--Driver--Role--IsSizeAware \
perl-CHI--Driver--Role--IsSubcache \
perl-CHI--Driver--Role--Universal \
perl-CHI--Serializer--JSON \
perl-CHI--Serializer--Storable \
perl-CHI--Stats \
perl-CHI--Test \
perl-CHI--Test--Class \
perl-CHI--Test--Driver--NonMoose \
perl-CHI--Test--Driver--Readonly \
perl-CHI--Test--Driver--Role--CheckKeyValidity \
perl-CHI--Test--Driver--Writeonly \
perl-CHI--Test--Util \
perl-CHI--Types \
perl-CHI--Util \
perl-CHI--t--Bugs \
perl-CHI--t--Config \
perl-CHI--t--Constants \
perl-CHI--t--Driver \
perl-CHI--t--Driver--CacheCache \
perl-CHI--t--Driver--FastMmap \
perl-CHI--t--Driver--File \
perl-CHI--t--Driver--File--BadTempDriver \
perl-CHI--t--Driver--File--DepthZero \
perl-CHI--t--Driver--File--NoTempDriver \
perl-CHI--t--Driver--Memory \
perl-CHI--t--Driver--NonMoose \
perl-CHI--t--Driver--RawMemory \
perl-CHI--t--Driver--Subcache \
perl-CHI--t--Driver--Subcache--l1-cache \
perl-CHI--t--Driver--Subcache--mirror-cache \
perl-CHI--t--GetError \
perl-CHI--t--Initialize \
perl-CHI--t--Null \
perl-CHI--t--RequiredModules \
perl-CHI--t--Sanity \
perl-CHI--t--SetError \
perl-CHI--t--Subcache \
perl-CHI--t--Subclass \
perl-CHI--t--Subclass--Driver--HasUnsupported \
perl-CHI--t--Util \
perl-DummySerializer \
perl-Foo \
perl-My--CHI \
perl-My--CHI--Memo \
perl-My--CHI--Subclass"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Carp--Assert \
perl-Class--Load \
perl-Data--UUID \
perl-Digest--JHash \
perl-Hash--MoreUtils \
perl-JSON--MaybeXS \
perl-List--MoreUtils \
perl-Log--Any \
perl-Moo \
perl-MooX--Types--MooseLike \
perl-MooX--Types--MooseLike--Base \
perl-MooX--Types--MooseLike--Numeric \
perl-String--RewritePrefix \
perl-Task--Weaken \
perl-Time--Duration \
perl-Time--Duration--Parse \
perl-Try--Tiny"

inherit rpm
