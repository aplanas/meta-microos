SUMMARY = "Extremely flexible deep comparison"
DESCRIPTION = "If you don't know anything about automated testing in Perl then you should \
probably read about Test::Simple and Test::More before preceding. \
Test::Deep uses the Test::Builder framework. \
 \
Test::Deep gives you very flexible ways to check that the result you got is \
the result you were expecting. At its simplest it compares two structures \
by going through each level, ensuring that the values match, that arrays \
and hashes have the same elements and that references are blessed into the \
correct class. It also handles circular data structures without getting \
caught in an infinite loop. \
 \
Where it becomes more interesting is in allowing you to do something \
besides simple exact comparisons. With strings, the 'eq' operator checks \
that 2 strings are exactly equal but sometimes that's not what you want. \
When you don't know exactly what the string should be but you do know some \
things about how it should look, 'eq' is no good and you must use pattern \
matching instead. Test::Deep provides pattern matching for complex data \
structures \
 \
Test::Deep has *_a lot_* of exports. See EXPORTS below."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.204"

RPM_NAME = "perl-Test-Deep-1.204-1.1.noarch.rpm"
RPM_HASH = "77440fc3638c3d4e2e9076a74a64e1e73069d638df2347ce9b6051bc95137a9dabe241f3ef7b8349e1ffc42b59f760bc9506c2637c24fbe6363eafcb6cec1831"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Deep) \
perl(Test::Deep::All) \
perl(Test::Deep::Any) \
perl(Test::Deep::Array) \
perl(Test::Deep::ArrayEach) \
perl(Test::Deep::ArrayElementsOnly) \
perl(Test::Deep::ArrayLength) \
perl(Test::Deep::ArrayLengthOnly) \
perl(Test::Deep::Blessed) \
perl(Test::Deep::Boolean) \
perl(Test::Deep::Cache) \
perl(Test::Deep::Cache::Simple) \
perl(Test::Deep::Class) \
perl(Test::Deep::Cmp) \
perl(Test::Deep::Code) \
perl(Test::Deep::Hash) \
perl(Test::Deep::HashEach) \
perl(Test::Deep::HashElements) \
perl(Test::Deep::HashKeys) \
perl(Test::Deep::HashKeysOnly) \
perl(Test::Deep::Ignore) \
perl(Test::Deep::Isa) \
perl(Test::Deep::ListMethods) \
perl(Test::Deep::MM) \
perl(Test::Deep::Methods) \
perl(Test::Deep::NoTest) \
perl(Test::Deep::None) \
perl(Test::Deep::Number) \
perl(Test::Deep::Obj) \
perl(Test::Deep::Ref) \
perl(Test::Deep::RefType) \
perl(Test::Deep::Regexp) \
perl(Test::Deep::RegexpMatches) \
perl(Test::Deep::RegexpOnly) \
perl(Test::Deep::RegexpRef) \
perl(Test::Deep::RegexpRefOnly) \
perl(Test::Deep::RegexpVersion) \
perl(Test::Deep::ScalarRef) \
perl(Test::Deep::ScalarRefOnly) \
perl(Test::Deep::Set) \
perl(Test::Deep::Shallow) \
perl(Test::Deep::Stack) \
perl(Test::Deep::String) \
perl(Test::Deep::SubHash) \
perl(Test::Deep::SubHashElements) \
perl(Test::Deep::SubHashKeys) \
perl(Test::Deep::SubHashKeysOnly) \
perl(Test::Deep::SuperHash) \
perl(Test::Deep::SuperHashElements) \
perl(Test::Deep::SuperHashKeys) \
perl(Test::Deep::SuperHashKeysOnly) \
perl-Test-Deep"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Test::More) \
perl-Test-Simple"

inherit rpm
