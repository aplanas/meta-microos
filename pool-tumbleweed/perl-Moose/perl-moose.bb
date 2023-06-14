SUMMARY = "Postmodern object system for Perl 5"
DESCRIPTION = "Moose is an extension of the Perl 5 object system. \
 \
The main goal of Moose is to make Perl 5 Object Oriented programming \
easier, more consistent, and less tedious. With Moose you can think more \
about what you want to do and less about the mechanics of OOP. \
 \
Additionally, Moose is built on top of Class::MOP, which is a metaclass \
system for Perl 5. This means that Moose not only makes building normal \
Perl 5 objects better, but it provides the power of metaclass programming \
as well."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.2203"

RPM_NAME = "perl-Moose-2.2203-1.2.aarch64.rpm"
RPM_HASH = "64c4fd95490d7c266533af2ba9d1f5ffc4db3a7392ff6f6471fd7bee89dcd33bd4b3b6e6c00d43687050fa59391200cbb417d25f99d36ad5f14ab256b7462dab"

RPROVIDES:${PN} += "perl-Class--MOP \
perl-Class--MOP--Attribute \
perl-Class--MOP--Class \
perl-Class--MOP--Class--Immutable--Trait \
perl-Class--MOP--Deprecated \
perl-Class--MOP--Instance \
perl-Class--MOP--Method \
perl-Class--MOP--Method--Accessor \
perl-Class--MOP--Method--Constructor \
perl-Class--MOP--Method--Generated \
perl-Class--MOP--Method--Inlined \
perl-Class--MOP--Method--Meta \
perl-Class--MOP--Method--Wrapped \
perl-Class--MOP--MiniTrait \
perl-Class--MOP--Mixin \
perl-Class--MOP--Mixin--AttributeCore \
perl-Class--MOP--Mixin--HasAttributes \
perl-Class--MOP--Mixin--HasMethods \
perl-Class--MOP--Mixin--HasOverloads \
perl-Class--MOP--Module \
perl-Class--MOP--Object \
perl-Class--MOP--Overload \
perl-Class--MOP--Package \
perl-Class-MOP \
perl-Moose \
perl-Moose--Deprecated \
perl-Moose--Exception \
perl-Moose--Exception--AccessorMustReadWrite \
perl-Moose--Exception--AddParameterizableTypeTakesParameterizableType \
perl-Moose--Exception--AddRoleTakesAMooseMetaRoleInstance \
perl-Moose--Exception--AddRoleToARoleTakesAMooseMetaRole \
perl-Moose--Exception--ApplyTakesABlessedInstance \
perl-Moose--Exception--AttachToClassNeedsAClassMOPClassInstanceOrASubclass \
perl-Moose--Exception--AttributeConflictInRoles \
perl-Moose--Exception--AttributeConflictInSummation \
perl-Moose--Exception--AttributeExtensionIsNotSupportedInRoles \
perl-Moose--Exception--AttributeIsRequired \
perl-Moose--Exception--AttributeMustBeAnClassMOPMixinAttributeCoreOrSubclass \
perl-Moose--Exception--AttributeNamesDoNotMatch \
perl-Moose--Exception--AttributeValueIsNotAnObject \
perl-Moose--Exception--AttributeValueIsNotDefined \
perl-Moose--Exception--AutoDeRefNeedsArrayRefOrHashRef \
perl-Moose--Exception--BadOptionFormat \
perl-Moose--Exception--BothBuilderAndDefaultAreNotAllowed \
perl-Moose--Exception--BuilderDoesNotExist \
perl-Moose--Exception--BuilderMethodNotSupportedForAttribute \
perl-Moose--Exception--BuilderMethodNotSupportedForInlineAttribute \
perl-Moose--Exception--BuilderMustBeAMethodName \
perl-Moose--Exception--CallingMethodOnAnImmutableInstance \
perl-Moose--Exception--CallingReadOnlyMethodOnAnImmutableInstance \
perl-Moose--Exception--CanExtendOnlyClasses \
perl-Moose--Exception--CanOnlyConsumeRole \
perl-Moose--Exception--CanOnlyWrapBlessedCode \
perl-Moose--Exception--CanReblessOnlyIntoASubclass \
perl-Moose--Exception--CanReblessOnlyIntoASuperclass \
perl-Moose--Exception--CannotAddAdditionalTypeCoercionsToUnion \
perl-Moose--Exception--CannotAddAsAnAttributeToARole \
perl-Moose--Exception--CannotApplyBaseClassRolesToRole \
perl-Moose--Exception--CannotAssignValueToReadOnlyAccessor \
perl-Moose--Exception--CannotAugmentIfLocalMethodPresent \
perl-Moose--Exception--CannotAugmentNoSuperMethod \
perl-Moose--Exception--CannotAutoDerefWithoutIsa \
perl-Moose--Exception--CannotAutoDereferenceTypeConstraint \
perl-Moose--Exception--CannotCalculateNativeType \
perl-Moose--Exception--CannotCallAnAbstractBaseMethod \
perl-Moose--Exception--CannotCallAnAbstractMethod \
perl-Moose--Exception--CannotCoerceAWeakRef \
perl-Moose--Exception--CannotCoerceAttributeWhichHasNoCoercion \
perl-Moose--Exception--CannotCreateHigherOrderTypeWithoutATypeParameter \
perl-Moose--Exception--CannotCreateMethodAliasLocalMethodIsPresent \
perl-Moose--Exception--CannotCreateMethodAliasLocalMethodIsPresentInClass \
perl-Moose--Exception--CannotDelegateLocalMethodIsPresent \
perl-Moose--Exception--CannotDelegateWithoutIsa \
perl-Moose--Exception--CannotFindDelegateMetaclass \
perl-Moose--Exception--CannotFindType \
perl-Moose--Exception--CannotFindTypeGivenToMatchOnType \
perl-Moose--Exception--CannotFixMetaclassCompatibility \
perl-Moose--Exception--CannotGenerateInlineConstraint \
perl-Moose--Exception--CannotInitializeMooseMetaRoleComposite \
perl-Moose--Exception--CannotInlineTypeConstraintCheck \
perl-Moose--Exception--CannotLocatePackageInINC \
perl-Moose--Exception--CannotMakeMetaclassCompatible \
perl-Moose--Exception--CannotOverrideALocalMethod \
perl-Moose--Exception--CannotOverrideBodyOfMetaMethods \
perl-Moose--Exception--CannotOverrideLocalMethodIsPresent \
perl-Moose--Exception--CannotOverrideNoSuperMethod \
perl-Moose--Exception--CannotRegisterUnnamedTypeConstraint \
perl-Moose--Exception--CannotUseLazyBuildAndDefaultSimultaneously \
perl-Moose--Exception--CircularReferenceInAlso \
perl-Moose--Exception--ClassDoesNotHaveInitMeta \
perl-Moose--Exception--ClassDoesTheExcludedRole \
perl-Moose--Exception--ClassNamesDoNotMatch \
perl-Moose--Exception--CloneObjectExpectsAnInstanceOfMetaclass \
perl-Moose--Exception--CodeBlockMustBeACodeRef \
perl-Moose--Exception--CoercingWithoutCoercions \
perl-Moose--Exception--CoercionAlreadyExists \
perl-Moose--Exception--CoercionNeedsTypeConstraint \
perl-Moose--Exception--ConflictDetectedInCheckRoleExclusions \
perl-Moose--Exception--ConflictDetectedInCheckRoleExclusionsInToClass \
perl-Moose--Exception--ConstructClassInstanceTakesPackageName \
perl-Moose--Exception--CouldNotCreateMethod \
perl-Moose--Exception--CouldNotCreateWriter \
perl-Moose--Exception--CouldNotEvalConstructor \
perl-Moose--Exception--CouldNotEvalDestructor \
perl-Moose--Exception--CouldNotFindTypeConstraintToCoerceFrom \
perl-Moose--Exception--CouldNotGenerateInlineAttributeMethod \
perl-Moose--Exception--CouldNotLocateTypeConstraintForUnion \
perl-Moose--Exception--CouldNotParseType \
perl-Moose--Exception--CreateMOPClassTakesArrayRefOfAttributes \
perl-Moose--Exception--CreateMOPClassTakesArrayRefOfSuperclasses \
perl-Moose--Exception--CreateMOPClassTakesHashRefOfMethods \
perl-Moose--Exception--CreateTakesArrayRefOfRoles \
perl-Moose--Exception--CreateTakesHashRefOfAttributes \
perl-Moose--Exception--CreateTakesHashRefOfMethods \
perl-Moose--Exception--DefaultToMatchOnTypeMustBeCodeRef \
perl-Moose--Exception--DelegationToAClassWhichIsNotLoaded \
perl-Moose--Exception--DelegationToARoleWhichIsNotLoaded \
perl-Moose--Exception--DelegationToATypeWhichIsNotAClass \
perl-Moose--Exception--DoesRequiresRoleName \
perl-Moose--Exception--EnumCalledWithAnArrayRefAndAdditionalArgs \
perl-Moose--Exception--EnumValuesMustBeString \
perl-Moose--Exception--ExtendsMissingArgs \
perl-Moose--Exception--HandlesMustBeAHashRef \
perl-Moose--Exception--IllegalInheritedOptions \
perl-Moose--Exception--IllegalMethodTypeToAddMethodModifier \
perl-Moose--Exception--IncompatibleMetaclassOfSuperclass \
perl-Moose--Exception--InitMetaRequiresClass \
perl-Moose--Exception--InitializeTakesUnBlessedPackageName \
perl-Moose--Exception--InstanceBlessedIntoWrongClass \
perl-Moose--Exception--InstanceMustBeABlessedReference \
perl-Moose--Exception--InvalidArgPassedToMooseUtilMetaRole \
perl-Moose--Exception--InvalidArgumentToMethod \
perl-Moose--Exception--InvalidArgumentsToTraitAliases \
perl-Moose--Exception--InvalidBaseTypeGivenToCreateParameterizedTypeConstraint \
perl-Moose--Exception--InvalidHandleValue \
perl-Moose--Exception--InvalidHasProvidedInARole \
perl-Moose--Exception--InvalidNameForType \
perl-Moose--Exception--InvalidOverloadOperator \
perl-Moose--Exception--InvalidRoleApplication \
perl-Moose--Exception--InvalidTypeConstraint \
perl-Moose--Exception--InvalidTypeGivenToCreateParameterizedTypeConstraint \
perl-Moose--Exception--InvalidValueForIs \
perl-Moose--Exception--IsaDoesNotDoTheRole \
perl-Moose--Exception--IsaLacksDoesMethod \
perl-Moose--Exception--LazyAttributeNeedsADefault \
perl-Moose--Exception--Legacy \
perl-Moose--Exception--MOPAttributeNewNeedsAttributeName \
perl-Moose--Exception--MatchActionMustBeACodeRef \
perl-Moose--Exception--MessageParameterMustBeCodeRef \
perl-Moose--Exception--MetaclassIsAClassNotASubclassOfGivenMetaclass \
perl-Moose--Exception--MetaclassIsARoleNotASubclassOfGivenMetaclass \
perl-Moose--Exception--MetaclassIsNotASubclassOfGivenMetaclass \
perl-Moose--Exception--MetaclassMustBeASubclassOfMooseMetaClass \
perl-Moose--Exception--MetaclassMustBeASubclassOfMooseMetaRole \
perl-Moose--Exception--MetaclassMustBeDerivedFromClassMOPClass \
perl-Moose--Exception--MetaclassNotLoaded \
perl-Moose--Exception--MetaclassTypeIncompatible \
perl-Moose--Exception--MethodExpectedAMetaclassObject \
perl-Moose--Exception--MethodExpectsFewerArgs \
perl-Moose--Exception--MethodExpectsMoreArgs \
perl-Moose--Exception--MethodModifierNeedsMethodName \
perl-Moose--Exception--MethodNameConflictInRoles \
perl-Moose--Exception--MethodNameNotFoundInInheritanceHierarchy \
perl-Moose--Exception--MethodNameNotGiven \
perl-Moose--Exception--MustDefineAMethodName \
perl-Moose--Exception--MustDefineAnAttributeName \
perl-Moose--Exception--MustDefineAnOverloadOperator \
perl-Moose--Exception--MustHaveAtLeastOneValueToEnumerate \
perl-Moose--Exception--MustPassAHashOfOptions \
perl-Moose--Exception--MustPassAMooseMetaRoleInstanceOrSubclass \
perl-Moose--Exception--MustPassAPackageNameOrAnExistingClassMOPPackageInstance \
perl-Moose--Exception--MustPassEvenNumberOfArguments \
perl-Moose--Exception--MustPassEvenNumberOfAttributeOptions \
perl-Moose--Exception--MustProvideANameForTheAttribute \
perl-Moose--Exception--MustSpecifyAtleastOneMethod \
perl-Moose--Exception--MustSpecifyAtleastOneRole \
perl-Moose--Exception--MustSpecifyAtleastOneRoleToApplicant \
perl-Moose--Exception--MustSupplyAClassMOPAttributeInstance \
perl-Moose--Exception--MustSupplyADelegateToMethod \
perl-Moose--Exception--MustSupplyAMetaclass \
perl-Moose--Exception--MustSupplyAMooseMetaAttributeInstance \
perl-Moose--Exception--MustSupplyAnAccessorTypeToConstructWith \
perl-Moose--Exception--MustSupplyAnAttributeToConstructWith \
perl-Moose--Exception--MustSupplyArrayRefAsCurriedArguments \
perl-Moose--Exception--MustSupplyPackageNameAndName \
perl-Moose--Exception--NeedsTypeConstraintUnionForTypeCoercionUnion \
perl-Moose--Exception--NeitherAttributeNorAttributeNameIsGiven \
perl-Moose--Exception--NeitherClassNorClassNameIsGiven \
perl-Moose--Exception--NeitherRoleNorRoleNameIsGiven \
perl-Moose--Exception--NeitherTypeNorTypeNameIsGiven \
perl-Moose--Exception--NoAttributeFoundInSuperClass \
perl-Moose--Exception--NoBodyToInitializeInAnAbstractBaseClass \
perl-Moose--Exception--NoCasesMatched \
perl-Moose--Exception--NoConstraintCheckForTypeConstraint \
perl-Moose--Exception--NoDestructorClassSpecified \
perl-Moose--Exception--NoImmutableTraitSpecifiedForClass \
perl-Moose--Exception--NoParentGivenToSubtype \
perl-Moose--Exception--OnlyInstancesCanBeCloned \
perl-Moose--Exception--OperatorIsRequired \
perl-Moose--Exception--OverloadConflictInSummation \
perl-Moose--Exception--OverloadRequiresAMetaClass \
perl-Moose--Exception--OverloadRequiresAMetaMethod \
perl-Moose--Exception--OverloadRequiresAMetaOverload \
perl-Moose--Exception--OverloadRequiresAMethodNameOrCoderef \
perl-Moose--Exception--OverloadRequiresAnOperator \
perl-Moose--Exception--OverloadRequiresNamesForCoderef \
perl-Moose--Exception--OverrideConflictInComposition \
perl-Moose--Exception--OverrideConflictInSummation \
perl-Moose--Exception--PackageDoesNotUseMooseExporter \
perl-Moose--Exception--PackageNameAndNameParamsNotGivenToWrap \
perl-Moose--Exception--PackagesAndModulesAreNotCachable \
perl-Moose--Exception--ParameterIsNotSubtypeOfParent \
perl-Moose--Exception--ReferencesAreNotAllowedAsDefault \
perl-Moose--Exception--RequiredAttributeLacksInitialization \
perl-Moose--Exception--RequiredAttributeNeedsADefault \
perl-Moose--Exception--RequiredMethodsImportedByClass \
perl-Moose--Exception--RequiredMethodsNotImplementedByClass \
perl-Moose--Exception--Role--Attribute \
perl-Moose--Exception--Role--AttributeName \
perl-Moose--Exception--Role--Class \
perl-Moose--Exception--Role--EitherAttributeOrAttributeName \
perl-Moose--Exception--Role--Instance \
perl-Moose--Exception--Role--InstanceClass \
perl-Moose--Exception--Role--InvalidAttributeOptions \
perl-Moose--Exception--Role--Method \
perl-Moose--Exception--Role--ParamsHash \
perl-Moose--Exception--Role--Role \
perl-Moose--Exception--Role--RoleForCreate \
perl-Moose--Exception--Role--RoleForCreateMOPClass \
perl-Moose--Exception--Role--TypeConstraint \
perl-Moose--Exception--RoleDoesTheExcludedRole \
perl-Moose--Exception--RoleExclusionConflict \
perl-Moose--Exception--RoleNameRequired \
perl-Moose--Exception--RoleNameRequiredForMooseMetaRole \
perl-Moose--Exception--RolesDoNotSupportAugment \
perl-Moose--Exception--RolesDoNotSupportExtends \
perl-Moose--Exception--RolesDoNotSupportInner \
perl-Moose--Exception--RolesDoNotSupportRegexReferencesForMethodModifiers \
perl-Moose--Exception--RolesInCreateTakesAnArrayRef \
perl-Moose--Exception--RolesListMustBeInstancesOfMooseMetaRole \
perl-Moose--Exception--SingleParamsToNewMustBeHashRef \
perl-Moose--Exception--TriggerMustBeACodeRef \
perl-Moose--Exception--TypeConstraintCannotBeUsedForAParameterizableType \
perl-Moose--Exception--TypeConstraintIsAlreadyCreated \
perl-Moose--Exception--TypeParameterMustBeMooseMetaType \
perl-Moose--Exception--UnableToCanonicalizeHandles \
perl-Moose--Exception--UnableToCanonicalizeNonRolePackage \
perl-Moose--Exception--UnableToRecognizeDelegateMetaclass \
perl-Moose--Exception--UndefinedHashKeysPassedToMethod \
perl-Moose--Exception--UnionCalledWithAnArrayRefAndAdditionalArgs \
perl-Moose--Exception--UnionTakesAtleastTwoTypeNames \
perl-Moose--Exception--ValidationFailedForInlineTypeConstraint \
perl-Moose--Exception--ValidationFailedForTypeConstraint \
perl-Moose--Exception--WrapTakesACodeRefToBless \
perl-Moose--Exception--WrongTypeConstraintGiven \
perl-Moose--Exporter \
perl-Moose--Meta--Attribute \
perl-Moose--Meta--Attribute--Native \
perl-Moose--Meta--Attribute--Native--Trait \
perl-Moose--Meta--Attribute--Native--Trait--Array \
perl-Moose--Meta--Attribute--Native--Trait--Bool \
perl-Moose--Meta--Attribute--Native--Trait--Code \
perl-Moose--Meta--Attribute--Native--Trait--Counter \
perl-Moose--Meta--Attribute--Native--Trait--Hash \
perl-Moose--Meta--Attribute--Native--Trait--Number \
perl-Moose--Meta--Attribute--Native--Trait--String \
perl-Moose--Meta--Class \
perl-Moose--Meta--Class--Immutable--Trait \
perl-Moose--Meta--Instance \
perl-Moose--Meta--Method \
perl-Moose--Meta--Method--Accessor \
perl-Moose--Meta--Method--Accessor--Native \
perl-Moose--Meta--Method--Accessor--Native--Array \
perl-Moose--Meta--Method--Accessor--Native--Array--Writer \
perl-Moose--Meta--Method--Accessor--Native--Array--accessor \
perl-Moose--Meta--Method--Accessor--Native--Array--clear \
perl-Moose--Meta--Method--Accessor--Native--Array--count \
perl-Moose--Meta--Method--Accessor--Native--Array--delete \
perl-Moose--Meta--Method--Accessor--Native--Array--elements \
perl-Moose--Meta--Method--Accessor--Native--Array--first \
perl-Moose--Meta--Method--Accessor--Native--Array--first-index \
perl-Moose--Meta--Method--Accessor--Native--Array--get \
perl-Moose--Meta--Method--Accessor--Native--Array--grep \
perl-Moose--Meta--Method--Accessor--Native--Array--insert \
perl-Moose--Meta--Method--Accessor--Native--Array--is-empty \
perl-Moose--Meta--Method--Accessor--Native--Array--join \
perl-Moose--Meta--Method--Accessor--Native--Array--map \
perl-Moose--Meta--Method--Accessor--Native--Array--natatime \
perl-Moose--Meta--Method--Accessor--Native--Array--pop \
perl-Moose--Meta--Method--Accessor--Native--Array--push \
perl-Moose--Meta--Method--Accessor--Native--Array--reduce \
perl-Moose--Meta--Method--Accessor--Native--Array--set \
perl-Moose--Meta--Method--Accessor--Native--Array--shallow-clone \
perl-Moose--Meta--Method--Accessor--Native--Array--shift \
perl-Moose--Meta--Method--Accessor--Native--Array--shuffle \
perl-Moose--Meta--Method--Accessor--Native--Array--sort \
perl-Moose--Meta--Method--Accessor--Native--Array--sort-in-place \
perl-Moose--Meta--Method--Accessor--Native--Array--splice \
perl-Moose--Meta--Method--Accessor--Native--Array--uniq \
perl-Moose--Meta--Method--Accessor--Native--Array--unshift \
perl-Moose--Meta--Method--Accessor--Native--Bool--not \
perl-Moose--Meta--Method--Accessor--Native--Bool--set \
perl-Moose--Meta--Method--Accessor--Native--Bool--toggle \
perl-Moose--Meta--Method--Accessor--Native--Bool--unset \
perl-Moose--Meta--Method--Accessor--Native--Code--execute \
perl-Moose--Meta--Method--Accessor--Native--Code--execute-method \
perl-Moose--Meta--Method--Accessor--Native--Collection \
perl-Moose--Meta--Method--Accessor--Native--Counter--Writer \
perl-Moose--Meta--Method--Accessor--Native--Counter--dec \
perl-Moose--Meta--Method--Accessor--Native--Counter--inc \
perl-Moose--Meta--Method--Accessor--Native--Counter--reset \
perl-Moose--Meta--Method--Accessor--Native--Counter--set \
perl-Moose--Meta--Method--Accessor--Native--Hash \
perl-Moose--Meta--Method--Accessor--Native--Hash--Writer \
perl-Moose--Meta--Method--Accessor--Native--Hash--accessor \
perl-Moose--Meta--Method--Accessor--Native--Hash--clear \
perl-Moose--Meta--Method--Accessor--Native--Hash--count \
perl-Moose--Meta--Method--Accessor--Native--Hash--defined \
perl-Moose--Meta--Method--Accessor--Native--Hash--delete \
perl-Moose--Meta--Method--Accessor--Native--Hash--elements \
perl-Moose--Meta--Method--Accessor--Native--Hash--exists \
perl-Moose--Meta--Method--Accessor--Native--Hash--get \
perl-Moose--Meta--Method--Accessor--Native--Hash--is-empty \
perl-Moose--Meta--Method--Accessor--Native--Hash--keys \
perl-Moose--Meta--Method--Accessor--Native--Hash--kv \
perl-Moose--Meta--Method--Accessor--Native--Hash--set \
perl-Moose--Meta--Method--Accessor--Native--Hash--shallow-clone \
perl-Moose--Meta--Method--Accessor--Native--Hash--values \
perl-Moose--Meta--Method--Accessor--Native--Number--abs \
perl-Moose--Meta--Method--Accessor--Native--Number--add \
perl-Moose--Meta--Method--Accessor--Native--Number--div \
perl-Moose--Meta--Method--Accessor--Native--Number--mod \
perl-Moose--Meta--Method--Accessor--Native--Number--mul \
perl-Moose--Meta--Method--Accessor--Native--Number--set \
perl-Moose--Meta--Method--Accessor--Native--Number--sub \
perl-Moose--Meta--Method--Accessor--Native--Reader \
perl-Moose--Meta--Method--Accessor--Native--String--append \
perl-Moose--Meta--Method--Accessor--Native--String--chomp \
perl-Moose--Meta--Method--Accessor--Native--String--chop \
perl-Moose--Meta--Method--Accessor--Native--String--clear \
perl-Moose--Meta--Method--Accessor--Native--String--inc \
perl-Moose--Meta--Method--Accessor--Native--String--length \
perl-Moose--Meta--Method--Accessor--Native--String--match \
perl-Moose--Meta--Method--Accessor--Native--String--prepend \
perl-Moose--Meta--Method--Accessor--Native--String--replace \
perl-Moose--Meta--Method--Accessor--Native--String--substr \
perl-Moose--Meta--Method--Accessor--Native--Writer \
perl-Moose--Meta--Method--Augmented \
perl-Moose--Meta--Method--Constructor \
perl-Moose--Meta--Method--Delegation \
perl-Moose--Meta--Method--Destructor \
perl-Moose--Meta--Method--Meta \
perl-Moose--Meta--Method--Overridden \
perl-Moose--Meta--Mixin--AttributeCore \
perl-Moose--Meta--Object--Trait \
perl-Moose--Meta--Role \
perl-Moose--Meta--Role--Application \
perl-Moose--Meta--Role--Application--RoleSummation \
perl-Moose--Meta--Role--Application--ToClass \
perl-Moose--Meta--Role--Application--ToInstance \
perl-Moose--Meta--Role--Application--ToRole \
perl-Moose--Meta--Role--Attribute \
perl-Moose--Meta--Role--Composite \
perl-Moose--Meta--Role--Method \
perl-Moose--Meta--Role--Method--Conflicting \
perl-Moose--Meta--Role--Method--Required \
perl-Moose--Meta--TypeCoercion \
perl-Moose--Meta--TypeCoercion--Union \
perl-Moose--Meta--TypeConstraint \
perl-Moose--Meta--TypeConstraint--Class \
perl-Moose--Meta--TypeConstraint--DuckType \
perl-Moose--Meta--TypeConstraint--Enum \
perl-Moose--Meta--TypeConstraint--Parameterizable \
perl-Moose--Meta--TypeConstraint--Parameterized \
perl-Moose--Meta--TypeConstraint--Registry \
perl-Moose--Meta--TypeConstraint--Role \
perl-Moose--Meta--TypeConstraint--Union \
perl-Moose--Object \
perl-Moose--Role \
perl-Moose--Util \
perl-Moose--Util--MetaRole \
perl-Moose--Util--TypeConstraints \
perl-Moose--Util--TypeConstraints--Builtins \
perl-Test--Moose \
perl-metaclass \
perl-oose"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0 \
perl-Carp \
perl-Class--Load \
perl-Class--Load--XS \
perl-Data--OptList \
perl-Devel--GlobalDestruction \
perl-Devel--OverloadInfo \
perl-Devel--StackTrace \
perl-Dist--CheckConflicts \
perl-Eval--Closure \
perl-List--Util \
perl-MRO--Compat \
perl-Module--Runtime \
perl-Module--Runtime--Conflicts \
perl-Package--DeprecationManager \
perl-Package--Stash \
perl-Package--Stash--XS \
perl-Params--Util \
perl-Scalar--Util \
perl-Sub--Exporter \
perl-Sub--Util \
perl-Try--Tiny \
perl-parent"

inherit rpm
