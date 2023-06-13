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

RPM_NAME = "perl-Cache-Cache-1.08-1.26.noarch.rpm"
RPM_HASH = "ad43445fa29d38af61134febc13c8628382294bb7770d0d62a24703f5168901e54dba4663fe5e27b4a0c22b3e1d00f768806fd875f6b1785f5eaab7a763d560f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Cache::BaseCache) \
perl(Cache::BaseCacheTester) \
perl(Cache::Cache) \
perl(Cache::CacheMetaData) \
perl(Cache::CacheSizer) \
perl(Cache::CacheTester) \
perl(Cache::CacheUtils) \
perl(Cache::FileBackend) \
perl(Cache::FileCache) \
perl(Cache::MemoryBackend) \
perl(Cache::MemoryCache) \
perl(Cache::NullCache) \
perl(Cache::Object) \
perl(Cache::SharedMemoryBackend) \
perl(Cache::SharedMemoryCache) \
perl(Cache::SizeAwareCache) \
perl(Cache::SizeAwareCacheTester) \
perl(Cache::SizeAwareFileCache) \
perl(Cache::SizeAwareMemoryCache) \
perl(Cache::SizeAwareSharedMemoryCache) \
perl-Cache-Cache"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Digest::SHA1) \
perl(Error) \
perl(IPC::ShareLite)"

inherit rpm
