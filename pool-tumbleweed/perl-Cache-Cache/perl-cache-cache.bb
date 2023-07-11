SUMMARY = "The Cache Interface"
DESCRIPTION = "The Cache modules are designed to assist a developer in persisting data for \
a specified period of time. Often these modules are used in web \
applications to store data locally to save repeated and redundant expensive \
calls to remote machines or databases. People have also been known to use \
Cache::Cache for its straightforward interface in sharing data between runs \
of an application or invocations of a CGI-style script or simply as an easy \
to use abstraction of the filesystem or shared memory. \
 \
The Cache::Cache interface is implemented by classes that support the get, \
set, remove, size, purge, and clear instance methods and their \
corresponding static methods for persisting data across method calls."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.08"

RPM_NAME = "perl-Cache-Cache-1.08-1.27.noarch.rpm"
RPM_HASH = "76314f077bc820d8215683d6aa145e665a50c7211abacf801beec0389940c5830f1b75b9d7101d04bb0c7e5577e0f350fb56e591e30ded5d8ccaef38370c3dc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Cache--BaseCache \
perl-Cache--BaseCacheTester \
perl-Cache--Cache \
perl-Cache--CacheMetaData \
perl-Cache--CacheSizer \
perl-Cache--CacheTester \
perl-Cache--CacheUtils \
perl-Cache--FileBackend \
perl-Cache--FileCache \
perl-Cache--MemoryBackend \
perl-Cache--MemoryCache \
perl-Cache--NullCache \
perl-Cache--Object \
perl-Cache--SharedMemoryBackend \
perl-Cache--SharedMemoryCache \
perl-Cache--SizeAwareCache \
perl-Cache--SizeAwareCacheTester \
perl-Cache--SizeAwareFileCache \
perl-Cache--SizeAwareMemoryCache \
perl-Cache--SizeAwareSharedMemoryCache \
perl-Cache-Cache"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Digest--SHA1 \
perl-Error \
perl-IPC--ShareLite"

inherit rpm
